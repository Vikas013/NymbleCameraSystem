package org.example;

import java.util.concurrent.PriorityBlockingQueue;

public class ProcessingQueue {

    // thread safe priority queue based on urgency level
    private final PriorityBlockingQueue<ImageProcessTask> queue = new PriorityBlockingQueue<>();

    public void addNewCaptureRequest(ImageProcessTask processTask) {
        queue.add(processTask);
    }
    public ImageProcessTask getCurrentCaptureRequest() {
        return queue.poll();
    }
}

