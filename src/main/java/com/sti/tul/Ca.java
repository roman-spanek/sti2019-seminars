
package com.sti.tul;

public class Ca {

  private RB rb;

  public Ca() {}

  public Ca(RB rb) {
    this.rb = rb;
  }

  public void setRowingBoat(RB rb) {
    this.rb = rb;
  }

  public void row() {
    rb.row();
  }

}
