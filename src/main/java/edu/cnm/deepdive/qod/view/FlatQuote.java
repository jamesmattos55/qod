package edu.cnm.deepdive.qod.view;

import java.util.Date;
import java.util.UUID;

public interface FlatQuote {

  public UUID getId();

  public Date getCreated();

  public String getText();

}
