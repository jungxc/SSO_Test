package com.example.Test.response;

import lombok.Data;

@Data
public class ResponseData {

  private Object result;

  public void setTokenId(String tokenId) {
    throw new UnsupportedOperationException("Unimplemented method 'setTokenId'");
  }

public void setUserId(String userId) {
    throw new UnsupportedOperationException("Unimplemented method 'setUserId'");
}
}
