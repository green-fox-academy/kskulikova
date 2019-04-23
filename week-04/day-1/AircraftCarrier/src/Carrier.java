
import java.util.ArrayList;
import java.util.List;

public class Carrier {

  private int storeOfAmmo;
  private int healthPoints;
  private List<Aircraft> carrier = new ArrayList<>();


  private int totalDamage() {
    int totalDamage = 0;
    for (Aircraft plane : carrier) {
      totalDamage += plane.getAllDamage();
    }
    return totalDamage;
  }


  private Object Exception = "No ammo in the storage!";


  Carrier(int ammo, int health) {
    storeOfAmmo = ammo;
    healthPoints = health;
  }

  void add(Aircraft aircraft) {
    carrier.add(aircraft);
  }

  public void fill() throws Throwable {
    if (storeOfAmmo > 0 && storeOfAmmo < carrierMissingAmo()) {
      for (Aircraft plane : carrier) {
        if (storeOfAmmo > 0) {
          if (plane.isPriority()) {
            storeOfAmmo -= plane.missingAmmo();
            plane.refill(plane.missingAmmo());
          }
          if (storeOfAmmo > 0) {
            for (Aircraft plane2 : carrier) {
              if (storeOfAmmo > 0) {
                if (!plane2.isPriority()) {
                  storeOfAmmo -= plane2.missingAmmo();
                  plane2.refill(plane2.missingAmmo());

                }
              }
            }
          }
        }
      }
    } else if (storeOfAmmo > 0 && storeOfAmmo > carrierMissingAmo()) {
      for (Aircraft plane : carrier) {
        plane.refill(plane.missingAmmo());
        storeOfAmmo -= plane.missingAmmo();
      }
    } else {
      throw (Throwable) Exception;
    }
  }


  private int carrierMissingAmo() {
    int missing = 0;
    for (Aircraft plane : carrier) {
      missing += plane.missingAmmo();
    }
    return missing;
  }

  void fight(Carrier enemy) {
    int damageDone = 0;
    for (Aircraft plane : carrier) {
      damageDone += plane.fight();
    }
    enemy.healthPoints -= damageDone;

  }

  String getStatus() {

    return this.toString();
  }

  @Override
  public String toString() {
    if (this.healthPoints <= 0) {
      return "It's dead, Jim :(";
    }

    StringBuilder result = new StringBuilder();

    result.append("HP: " + this.healthPoints + ", Aircraft count: " + this.carrier.size() +
        ", Ammo Storage: " + this.storeOfAmmo + ", Total Damage: " + this.totalDamage() + "\n" +
        "Aircrafts: \n");
    StringBuilder result1 = new StringBuilder();
    result1 = result;
    for (Aircraft planes : carrier) {
      result1.append(planes.getStatus());
    }
    return result1.toString();

  }
}
