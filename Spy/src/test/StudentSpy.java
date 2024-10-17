package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO .
 *
 * @author paolareyes
 */
public class StudentSpy {
    private Map<String, List<MethodInvocationSpy>> invocationMap = new HashMap<String, List<MethodInvocationSpy>>();

    public void registerCall(MethodInvocationSpy invocation) {
        List<MethodInvocationSpy> list = invocationMap.get(invocation.getMethod());
        if (list == null) {
            list = new ArrayList<MethodInvocationSpy>();
        }
        if (!list.contains(invocation)) {
            list.add(invocation);
        }

        invocationMap.put(invocation.getMethod(), list);
    }

    public int invocation(String methodName){
        List<MethodInvocationSpy> list = invocationMap.get(methodName);
        if(list == null){
            return 0;
        }

        return list.size();
    }

    public MethodInvocationSpy arguments(String methodName, int invocationIndex){
        List<MethodInvocationSpy> list = invocationMap.get(methodName);
        if(list == null || (invocationIndex > list.size())){
            return null;
        }
        return list.get(invocationIndex-1);
    }
}
