package br.com.icev.padroes.comportamentais.Memento;

public class EditorEstate {
  private final String content;

  public EditorEstate(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }
  
}
