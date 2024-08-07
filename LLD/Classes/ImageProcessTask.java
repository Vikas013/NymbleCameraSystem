package org.example;

import java.util.Objects;

public class ImageProcessTask implements Runnable{
    private final Request request;
    public ImageProcessTask(Request request){
        this.request = request;
    }
    @Override
    public void run() {
        /*
        1.Process image

        2. invoke callbacks with captured image
           incase of success and error message incase of failure
        */
    }
}


