package com.dewcked.Mediator;

public class Exit
{
  Mediator mediator;

  public Exit(Mediator m)
  {
    mediator = m;
  }

  public void go()
  {
    System.out.println("안녕히 가세요~.");
  }
}
