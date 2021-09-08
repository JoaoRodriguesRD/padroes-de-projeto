package br.com.icev.padroes.comportamentais.Memento;

public class Editor {
  private String content;

  public EditorEstate createState() {
    return new EditorEstate(content);
  }

  public void restore(EditorEstate state) {
    content = state.getContent();
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
