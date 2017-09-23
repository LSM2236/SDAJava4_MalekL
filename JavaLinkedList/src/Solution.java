
public class Solution extends Cwiczenie{

	public static void main(String[] args) {
		Node four = new Node(8);
		Node three = new Node(5, four);
		Node two = new Node(4, three);
		Node one = new Node(2, two);

		/*print(one);
		insertLast(one, 17);*/
		print(one);
		/*Node zero = insertFirst(one, 1);
		print(zero);
		delete(zero, 1);
		print(zero);*/
		wydrukuj(one);
	}

	static void print(Node head) {
		if (head ==null) {
			return;
		}
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);

		}


	static Node insertLast(Node head, int data) {
		Node node = head;
		while (node.next != null) {
			node = node.next;
		}
		node.next = new Node(data);
		return head;
	}
	
	static Node insertFirst(Node head,int x) {
		Node pierwszy = new Node(4);
		pierwszy.next = head;

		//usuñ linijkê poni¿ej i dodaj w³asn¹ implementacjê
		return new Node();
	}
	
	static Node delete(Node head, int position) {
		//usuñ linijkê poni¿ej i dodaj w³asn¹ implementacjê
		return new Node();
	}

}
