package characters.base;

public enum Magic {
  fireball(10, 12), heal(2, -2), magDef(5, 2);

  private int mana;
  private int atc;

  Magic(int i, int i1) {
    mana = i;
    atc = i1;
  }

  public int getMana() {
    return mana;
  }

  public int getAtc() {
    return atc;
  }

  @Override
  public String toString() {
    return (this.name() + ": требует маны: " + mana + " повреждения: " + atc);
  }
}
