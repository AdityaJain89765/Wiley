package Linka;

public class Imp {
	LinkList head=null;
	LinkList tail=null;
	public void add(int v) {
		LinkList node=new LinkList(v);
		if(head==null) {
			head=node;
			tail=node;
		}
		else
		{
			tail.next=node;
			tail=node;
		}
	}
	public void display() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else
		{
			LinkList current=head;
			while(current!=null)
			{
				System.out.println(current.v);
				current=current.next;
			}
		}
	}
	public static void main(String args[]) {
		Imp ob=new Imp();
		ob.add(2);
		ob.add(3);
		ob.display();
	}

}
