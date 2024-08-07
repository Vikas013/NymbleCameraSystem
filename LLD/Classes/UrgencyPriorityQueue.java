package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class UrgencyPriorityQueue {

    // thread safe priority queue based on urgency level
    private final Queue<Request> queue = new PriorityQueue(Comparator.comparing(Request::getUrgency));

    public void addNewCaptureRequest(Request request) {
        queue.add(request);
    }

    public Request getCurrentCaptureRequest() {
        return queue.poll();
    }
}

