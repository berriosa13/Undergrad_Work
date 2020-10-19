public class main extends JavaPlugin implements Listener {
   private Map<String, Integer> playerDeaths = new HashMap<String, Integer>();
   private Map<String, Integer> playerKills = new HashMap<String, Integer>();
 
   public void onEnable() {
      loadConfiguration();
      Bukkit.getServer().getPluginManager().registerEvents(this, this);
   }
 
   public void incrementKills(String playerName, int incrementAmount) {
      int currentKills = this.playerKills.containsKey(playerName) ? this.playerKills.get(playerName) : 0;
      if (currentKills + incrementAmount <= Integer.MAX_VALUE) currentKills += incrementAmount;
      else if (currentKills + incrementAmount < 0) currentKills = 0;
      else 
         return;
      this.playerKills.put(playerName, currentKills);
      this.getConfig().set(playerName + ".Kills", currentKills);
      this.saveConfig();
   }
 
   public void incrementDeaths(String playerName, int incrementAmount) {
      int currentDeaths = this.playerDeaths.containsKey(playerName) ? this.playerDeaths.get(playerName) : 0;
      if (currentDeaths + incrementAmount <= Integer.MAX_VALUE) currentDeaths += incrementAmount;
      else if (currentDeaths + incrementAmount < 0) currentDeaths = 0;
      else 
         return;
      this.playerDeaths.put(playerName, currentDeaths);
      this.getConfig().set(playerName + ".Deaths", currentDeaths);
      this.saveConfig();
   }
 
   public void loadConfiguration() {
      this.getConfig().options().header("The stats configuration");
      this.getConfig().addDefault("Test line", "Swag");
      this.getConfig().options().copyDefaults();
      this.getConfig().options().copyHeader(true);
      this.saveConfig();
   
      this.playerKills.clear();
      this.playerDeaths.clear();
      List<String> playerKeys = new ArrayList<String>(this.getConfig().getKeys(false));
      for (String player : playerKeys) {
         if (this.getConfig().contains(player + ".Kills")) this.playerKills.put(player, this.getConfig().getInt(player + ".Kills"));
         if (this.getConfig().contains(player + ".Deaths")) this.playerDeaths.put(player, this.getConfig().getInt(player + ".Deaths"));
      }
   }
 
   @EventHandler
   public void onPlayerDeath(PlayerDeathEvent e) {
      String dead = e.getEntity().getName();
      if (e.getEntity().getKiller() != null && !e.getEntity().getKiller().getName().equals(dead)) {
         this.incrementKills(e.getEntity().getKiller().getName(), 1);
      }
      this.incrementDeaths(dead, 1);
   }
 
   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
      if(!(sender instanceof Player)) {
         sender.sendMessage(ChatColor.RED + "You cannot use this command through console!");
      } else {
         if(cmd.getName().equalsIgnoreCase("stats") || cmd.getName().equalsIgnoreCase("stat")) {
            if(args.length == 0) {
               Player p = (Player) sender;
               int kills = this.playerKills.get(sender.getName());
               int deaths = this.playerDeaths.get(sender.getName());
               double kd = kills / deaths;
               sender.sendMessage(ChatColor.GRAY + "♦♦♦♦♦♦♦♦♦♦" + ChatColor.DARK_GRAY + " [" + ChatColor.DARK_AQUA + "TSMC Stats" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "♦♦♦♦♦♦♦♦♦♦");
               sender.sendMessage(ChatColor.AQUA + "Username: " + ChatColor.GOLD + sender.getName());
               sender.sendMessage(ChatColor.AQUA + "Kills: " + ChatColor.GOLD + (this.playerKills.get(sender.getName()) == null ? 0 : this.playerKills.get(sender.getName())));
               sender.sendMessage(ChatColor.AQUA + "Deaths: " + ChatColor.GOLD + (this.playerDeaths.get(sender.getName()) == null ? 0 : this.playerDeaths.get(sender.getName())));
               sender.sendMessage(ChatColor.AQUA + "K/D Ratio: " + ChatColor.GOLD + kd);
               sender.sendMessage(ChatColor.AQUA + "Levels: " + ChatColor.GOLD + p.getLevel());
               sender.sendMessage(ChatColor.GRAY + "♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
            } 
            if(args.length == 1) {
               Player p = (Player) sender;
               String strTargetPlayer = args[0];
               OfflinePlayer targetPlayer = Bukkit.getServer().getOfflinePlayer(strTargetPlayer);
               if(targetPlayer != null) {
                  sender.sendMessage(ChatColor.GRAY + "♦♦♦♦♦♦♦♦♦♦" + ChatColor.DARK_GRAY + " [" + ChatColor.DARK_AQUA + "TSMC Stats" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "♦♦♦♦♦♦♦♦♦♦");
                  sender.sendMessage(ChatColor.AQUA + "Username: " + ChatColor.GOLD + targetPlayer.getName());
                  sender.sendMessage(ChatColor.AQUA + "Kills: " + ChatColor.GOLD + (this.playerKills.get(targetPlayer.getName()) == null ? 0 : this.playerKills.get(targetPlayer.getName())));
                  sender.sendMessage(ChatColor.AQUA + "Deaths: " + ChatColor.GOLD + (this.playerDeaths.get(targetPlayer.getName()) == null ? 0 : this.playerDeaths.get(targetPlayer.getName())));
                  sender.sendMessage(ChatColor.AQUA + "Levels: " + ChatColor.GOLD + p.getLevel());
                  sender.sendMessage(ChatColor.GRAY + "♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
               }
            }
         }
      }
      return false;
   }
 
}
 
