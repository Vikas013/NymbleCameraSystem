package org.example;

import java.util.Objects;

public class ImageProcessor {
    private final ProcessingQueue processingQueue;
    public ImageProcessor() {
        this.processingQueue = new ProcessingQueue();
    }

    // thread safe priority queue based on urgency level
    public void addImageProcessingTask(Request request){
        processingQueue.addNewCaptureRequest(new ImageProcessTask(request));
    }
    private void processCaptureRequest(Request processRequest) {
        while (true) {
            try {
                if (Objects.nonNull(processRequest)) {
                    processCaptureRequest(processRequest);
                }
            } catch (Exception ex){
                // log error
                System.out.println("error occurred while processing request: " + ex.getMessage());
            }
        }

    }
}
