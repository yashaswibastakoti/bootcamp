package JavaCollection;

import java.util.ArrayDeque;

public class DemoArrayDequeue {
    public static void main(String[] args){

        //create an ArrayDequeue to simulate the call center queue
        ArrayDeque<Call> callQueue = new ArrayDeque<>();

        //simulate incoming calls
        callQueue.addLast(new Call("John"));
        callQueue.addLast(new Call("Mary"));
        callQueue.addLast(new Call("Peter"));

        //simulate outgoing calls(handling calls)
        while( !callQueue.isEmpty()){

            //retrieve and remove the call from the front of the queue
            Call incomingCall = callQueue.removeFirst();
            System.out.println("Handling incoming call: " + incomingCall);

            //simulate processing calls
            System.out.println("Call handled: " + incomingCall.getCallerName());
        }
        System.out.println("incoming calls handled.");

        //simulate outgoing calls
        callQueue.addFirst(new Call("David"));
        callQueue.addLast(new Call("Jane"));

        while( !callQueue.isEmpty()){

            //simulate and remove the call from the front of the queue
            Call outgoingCall = callQueue.removeFirst();
            System.out.println("Handling outgoing call: " + outgoingCall);

            //simulate making the call
            System.out.println("call handled: " + outgoingCall.getCallerName());
        }
        System.out.println("All follow up calls made.");
    }
}

class Call{
    private String callerName;

    public Call(String callerName){
        this.callerName = callerName;
    }
    public String getCallerName(){
        return callerName;
    }
    @Override
    public String toString(){
        return "Call from " + callerName;
    }
}
