package br.com.icev.padroes.comportamentais.Mediator;

public class Button extends UIControl {
  private boolean isEnabled;

  public boolean isEnabled() {
    return isEnabled;
  }

  public void setEnabled(boolean enabled) {
    isEnabled = enabled;
    notifyEventHandlers();
  }
}
