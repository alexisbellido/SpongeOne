package com.zinibu.spongeone;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;
import sun.rmi.runtime.Log;

@Plugin(id = "example", name = "Example Project", version = "1.0")
public class ExampleProject {

    @Inject
    private Logger logger;

    public Logger getLogger() {
        return logger;
    }

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        // Server started
        getLogger().info("[SpongeOne] started");
    }
}
