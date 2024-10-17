package test;

import java.util.ArrayList;
import java.util.List;

public class MethodInvocationSpy {

  private List<Object> params = new ArrayList<Object>();
  private Object returnedValue = null;
  private String method;

  public List<Object> getParams() {
    return params;
  }

  public MethodInvocationSpy addParam(Object parm){
    getParams().add(parm);
    return this;
  }

  public MethodInvocationSpy setReturnedValue(Object returnedValue) {
    this.returnedValue = returnedValue;
    return this;
  }

  public String getMethod() {
    return method;
  }

  public MethodInvocationSpy setMethod(String method) {
   this.method = method;
    return this;
  }
}
