package net.moonsworth.lunar;

import lombok.Getter;
import net.moonsworth.lunar.runnable.NameTagRunnable;
import net.moonsworth.lunar.utils.Color;
import net.moonsworth.lunar.utils.Config;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public final class Tags extends JavaPlugin {
  
  private Config config;
  private NameTagRunnable nameTagRunnable;
  
  @Override
  public void onEnable() {
    this.config = new Config(this, "config");
    this.nameTagRunnable = new NameTagRunnable(this);
    this.nameTagRunnable.runTaskTimerAsynchronously(this, 5L, 10L);
    
    this.getServer().getConsoleSender().sendMessage(Color.translate("&7&m--------------"));
    this.getServer().getConsoleSender().sendMessage(Color.translate("&6  LunarNametags. "));
    this.getServer().getConsoleSender().sendMessage(Color.translate("&r"));
    this.getServer().getConsoleSender().sendMessage(Color.translate("&6Author: &bMoonsworth"));
    this.getServer().getConsoleSender().sendMessage(Color.translate("&6Version: &f1.0-ESTABLE"));
    this.getServer().getConsoleSender().sendMessage(Color.translate("&r"));
    this.getServer().getConsoleSender().sendMessage(Color.translate("&7&m--------------"));
    
    //different
        this.getServer().getConsoleSender().sendMessage(Color.translate("&b[LunarNametags] &ahas been enabled"));
    }
}                                                        
