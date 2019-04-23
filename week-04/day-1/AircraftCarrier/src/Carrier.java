
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


  Carrier(int ammo, int health) throws Throwable {
    storeOfAmmo = ammo;
    healthPoints = health;
  }

  void add(Aircraft aircraft) {
    carrier.add(aircraft);
  }

  void fill() throws Throwable {
    if (storeOfAmmo > 0 && storeOfAmmo < carrierMissingAmmo()) {
      for (Aircraft plane : carrier) {
        if (storeOfAmmo > 0) {
          if (plane.isPriority()) {
            storeOfAmmo = plane.refill(storeOfAmmo);
          }
        }
      }
      if (storeOfAmmo > 0) {
        for (Aircraft plane2 : carrier) {
          if (storeOfAmmo > 0) {
            if (!plane2.isPriority()) {
              storeOfAmmo = plane2.refill(storeOfAmmo);
            }
          }

        }

      }
    } else if (storeOfAmmo > 0 && storeOfAmmo >

        carrierMissingAmmo()) {
      for (Aircraft plane : carrier) {
        plane.refill(plane.missingAmmo());
        storeOfAmmo -= plane.missingAmmo();
      }
    } else {
      throw (Throwable) Exception;
    }

  }


  private int carrierMissingAmmo() {
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

    result.append("HP: ").append(this.healthPoints).append(", Aircraft count: ")
        .append(this.carrier.size()).append(", Ammo Storage: ").append(this.storeOfAmmo)
        .append(", Total Damage: ").append(this.totalDamage()).append("\n").append("Aircrafts: \n");
    StringBuilder result1;
    result1 = result;
    for (Aircraft planes : carrier) {
      result1.append(planes.getStatus());
    }
    return result1.toString();

  }
}
