package org.example;

public class CameraSystem {
    final UrgencyPriorityQueue urgencyPriorityQueue = new UrgencyPriorityQueue();
    final ImageProcessor imageProcessor = new ImageProcessor();
    public void addCaptureRequest(Request request) {
        urgencyPriorityQueue.addNewCaptureRequest(request);
    }

    public void captureImage(Request request) {
        urgencyPriorityQueue.getCurrentCaptureRequest();
        request.image = "imageUrl";
        imageProcessor.addImageProcessingTask(request);
    }
}

