
public class Aircraft {

  private int ammo;
  private int allDamage;
  private int baseDamage;
  private int maxAmmo;

  int getAllDamage() {
    return allDamage;
  }

  void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  Aircraft() {
    ammo = 0;
  }

  int fight() {

    allDamage = baseDamage * ammo;
    ammo = 0;

    return allDamage;
  }

  int refill(int number) {
    if ((maxAmmo - ammo) < number) {
      ammo = maxAmmo;
      return number - (maxAmmo - ammo);

    } else {
      ammo = ammo + number;
      return 0;
    }
  }

  private String getType() {
    return this.getClass().getName();
  }


  String getStatus() {
    String status;
    status = "Type " + this.getType() + ", Ammo: " + this.ammo + ", Base Damage: " + baseDamage
        + ", All Damage: " + allDamage + "\n";
    return status;
  }

  boolean isPriority() {
    return (this.getType().equals("F35"));
  }

  int missingAmmo() {
    return maxAmmo - ammo;
  }


}
