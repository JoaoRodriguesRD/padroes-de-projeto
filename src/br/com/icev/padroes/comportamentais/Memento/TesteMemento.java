package br.com.icev.padroes.comportamentais.Memento;

public class TesteMemento {
    public static void main(String[] args) {
        History history = new History();
        Editor editor = new Editor();

        editor.setContent("A");
        history.push(editor.createState());

        editor.setContent("AB");
        history.push(editor.createState());

        editor.setContent("ABC");
        System.out.println(editor.getContent());

        editor.restore(history.pop());
        System.out.println(editor.getContent());

    }
}
