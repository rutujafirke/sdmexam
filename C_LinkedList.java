package Circular_LinkedList;

public class C_LinkedList {

	Node Head;

	public C_LinkedList() {
		Head=null;
	}

	public void Insert(int value) {
		Node N=new Node(value);

		if(Head==null) {
			Head=N;
			N.setNext(N);
		}
		//		else if(Head.getNext()==Head) {
		//			N.setNext(Head);
		//			Head.setNext(N);
		//			Head=N;
		//		}
		else {
			Node itt=Head; 

			while(itt.getNext() !=Head) {
				itt=itt.getNext();
			}
			itt.setNext(N);
			N.setNext(Head);	
			Head=N;

		}
	}

	public void Append(int value) {
		Node N=new Node(value);

		if(Head==null) {
			Head=N;
			N.setNext(Head);
		}
		else if(Head.getNext()==Head) {
			Head.setNext(N);
			N.setNext(Head);
		}
		else {
			Node itt=Head;
			while(itt.getNext()!=Head) {
				itt=itt.getNext();
			}
			itt.setNext(N);
			N.setNext(Head);
		}
	}

	public void DeleteF() {
		if(Head==null) System.out.println("Empty LinedList");
		else if(Head.getNext()==Head) {
			Node tmp=Head;
			Head=null;
			tmp.setNext(null);
		}
		else {
			int v=Head.getData();
			Head.setData(Head.getNext().getData());
			Head.getNext().setData(v);

			Node tmp=Head.getNext();
			Head.setNext(tmp.getNext());
			tmp.setNext(null);
		}
	}
	
	public void DeleteL() {
		if(Head==null) System.out.println("Empty LL");
		else if(Head.getNext()==Head) {
			Head.setNext(null);
			Head=null;
		}
		else {
			Node itt=Head;
			while(itt.getNext().getNext() != Head) {
				itt=itt.getNext();
			}
			itt.getNext().setNext(null);
			itt.setNext(Head);
		}
	}
	
	public void InsertByPos(int value,int pos) {
		int NON=getNON();
		if(pos==1)  Insert(value);
		else if(pos==NON+1) Append(value);
		else if(pos>1 && pos<=NON) {
			Node N=new Node(value);
			Node itt=Head;
			int a=1;
			while(a<(pos-1)) {
				itt=itt.getNext();
				a++;
			}
			N.setNext(itt.getNext());
			itt.setNext(N);
		}
		else System.out.println("Enter Valid Position !!!");
		
	}
	
	public void DeleteByPos(int pos) {
		
		int NON=getNON();
		
		if(pos==1) DeleteF();
		else if(pos==NON) DeleteL();
		else if(pos>1 && pos < NON) {
			Node itt=Head;
			int a=1;
			while(a<(pos-1)) {
				itt=itt.getNext();
				a++;
			}
			Node tmp=itt.getNext();
			itt.setNext(tmp.getNext());
			tmp.setNext(null);
		}
		else System.out.println("Enter Valid Position !!!");
	}
	
	private int getNON() {
		int count=0;
		Node itt=Head;
		while(itt.getNext() != Head) {
			itt=itt.getNext();
			count ++;
		}
		return count+1;
	}

	public String toString() {
		String str="";
		if(Head==null) {
			str=str + "Empty LL";
		}
		else {
			Node itt=Head;
			do {
				str=str + itt + "-->";
				itt=itt.getNext();
			}while(itt!=Head);
		}
		return str;
	}
}
