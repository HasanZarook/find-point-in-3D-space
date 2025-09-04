
# 📍 PointD Class (3D Point)

## 🌟 Overview

`PointD` represents a **point in 3-dimensional space** with coordinates `(x, y, z)`.

It includes:

* Multiple **constructors** for flexibility
* **Getter and Setter methods**
* Methods to **print** the point and **calculate distance from origin**
* Overrides `toString()` for easy printing

---

## 🛠 Code Features

### Attributes

```java
private int x; // X-coordinate
private int y; // Y-coordinate
private int z; // Z-coordinate
```

### Constructors

* **Default constructor** 📦: Sets `(x, y, z) = (1,1,1)`
* **Parameterized constructor** 🏗: Set specific coordinates

  ```java
  PointD(int X, int Y, int Z)
  PointD(int X)   // Only X is set, Y and Z default to 0
  ```

### Getters & Setters

* `getX() / setX(int xx)`
* `getY() / setY(int yy)`
* `getZ() / setZ(int zz)`

### Methods

* `print()` 🖨: Prints point as `[x, y, z]`
* `distO()` 📏: Returns **Euclidean distance from origin**

  ```java
  sqrt(x*x + y*y + z*z)
  ```
* `toString()` ✏️: Returns `[x, y, z]` as string

---

## 🚀 Example Usage

```java
PointD p1 = new PointD(5,6,7);
PointD p2 = new PointD();
p2.setX(6);
p2.setY(6);
p2.setZ(6);

p1.print();             // Output: [5,6,7]
System.out.println(p2); // Output: [6,6,6]

System.out.println("Distance from origin: " + p2.distO()); 
// Output: Euclidean distance
```

---

## 🎯 Notes

* You can **create arrays of points** and populate them dynamically.
* Randomization can be used to assign some points default values.
* The `distO()` method is handy for **distance calculations in 3D space**.

---
