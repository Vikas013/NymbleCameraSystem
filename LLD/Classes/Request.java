package org.example;

import java.util.function.Consumer;

public class Request {
    int urgency;
    int requestId;
    String image;
    public int getUrgency(){
        return urgency;
    }
    private Consumer<CapturedImage> successCallback;
    private Consumer<String> failureCallback;
}

