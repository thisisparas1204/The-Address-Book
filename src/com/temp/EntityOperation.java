package com.temp;

public class EntityOperation implements Runnable {
    private final Entity entity;
    private final String message;

    public EntityOperation(Entity entity, String message) {
        this.entity = entity;
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (entity) {
            entity.display(message);
        }
    }
}
