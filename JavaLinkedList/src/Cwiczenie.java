public class Cwiczenie {
    Node jeden = new Node();
    Node dwa = new Node();
    Node trzy = new Node();
    Node cztery = new Node();

    static void wydrukuj(Node glowa){
        if (glowa == null){
            return;
        }
        Node wezel = glowa;
        while (wezel.next != null){
            System.out.println(wezel.data);
            wezel = wezel.next;
        }
        System.out.println(wezel.data);

    }
}
