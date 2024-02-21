package characters.base;

import java.util.Random;

public enum Names {
  Blaze,
  Venom,
  Phoenix,
  Shadow,
  Storm,
  Ace,
  Nova,
  Rogue,
  Fissure,
  Perseus,
  Ratchet,
  Cobra,
  Reaper,
  Colt,
  Rigs,
  Crank,
  Ripley,
  Creep,
  Roadkill,
  Daemon,
  Hijacker,
  Locker,
  Manifesto,
  Fury,
  Thunder,
  Dragonite,
  Repulsor,
  Revenger,
  DrDisconnect,
  Stabber,
  AsaurusRex,
  UberFast,
  Disguised,
  MindOf,
  DrFast,
  Popper,
  BigFast,
  ItIsYe,
  IamFire,
  CaptainFire,
  TheFireDude,
  MrCool,
  Bloodbath,
  Conqueror,
  Tiger,
  Endeavour,
  Fox;

  public String getName() {
    return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
  }
}
