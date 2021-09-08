package br.com.icev.padroes.comportamentais.Memento;

import java.util.ArrayList;
import java.util.List;

public class History {
  private List<EditorEstate> states = new ArrayList<>();

  public void push(EditorEstate state) {
    states.add(state);
  }

  public EditorEstate pop() {
    var lastIndex = states.size() - 1;
    var lastState = states.get(lastIndex);
    states.remove(lastState);

    return lastState;
  }
}
