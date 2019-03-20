package edu.cnm.deepdive.qod.view;

import java.util.Date;
import java.util.UUID;

public interface FlatSource {

  public UUID getId();

  public Date getCreated();

  public String getText();

}
