# IoT Device Management System

This project demonstrates a simple IoT Device Management System using the **Model-View-Controller (MVC)** architecture. It is implemented in Java and includes the following layers:

## Layers Overview
1. **Model**:
   - Represents the data and business logic of the application.
   - Classes:
     - `IoTDevice`
     - `RoomAppliance`
     - `KitchenDevice`

2. **Controller**:
   - Handles user input and manages communication between the Model and the View.
   - Class:
     - `IoTController`

3. **View**:
   - Responsible for displaying data to the user.
   - Class:
     - `IoTView`

4. **Main**:
   - The entry point for the program where the application is executed.

---

## File Descriptions

### 1. `IoTDevice.java`
This class defines a general IoT device with three attributes:
- `name`: The name of the device.
- `specification`: The specification or features of the device.
- `price`: The price of the device.

### 2. `RoomAppliance.java`
This class extends `IoTDevice` and adds a specific attribute:
- `roomNo`: The room number where the appliance is located.

### 3. `KitchenDevice.java`
This class extends `IoTDevice` and adds a specific attribute:
- `kitchenNo`: The kitchen number where the device is located.

### 4. `IoTController.java`
The `IoTController` is responsible for creating instances of `RoomAppliance` or `KitchenDevice` based on user input. It uses the `createDevice()` method to:
- Accept parameters for the device type, name, specification, price, and an additional attribute (room or kitchen number).
- Instantiate the appropriate device and store it internally.

### 5. `IoTView.java`
The `IoTView` class is responsible for displaying the details of a given IoT device. It determines the type of the device (Room or Kitchen) and prints relevant details.

### 6. `Main.java`
The `Main` class serves as the entry point for the application. It demonstrates the following:
- Creating a `RoomAppliance` and a `KitchenDevice` through the `IoTController`.
- Displaying the details of each device using the `IoTView`.

---

## How to Run the Code
1. Save each class in its respective `.java` file with the exact name as the class (e.g., `IoTDevice.java`, `RoomAppliance.java`, etc.).
2. Place all files in the same directory or package structure if applicable.
3. Compile the files using the Java compiler:
   ```bash
   javac *.java
   ```
4. Run the `Main` class to execute the application:
   ```bash
   java Main
   ```

---

## Example Output
```
Device Name: Smart LED
Specification: LED TV with 4K Resolution
Price: 50000
Room Number: 101

Device Name: Microwave
Specification: Microwave with convection mode
Price: 20000
Kitchen Number: 202
```

---

## Project Architecture

### **Model-View-Controller (MVC)**
- **Model**:
  - Defines the data structure and logic (`IoTDevice`, `RoomAppliance`, `KitchenDevice`).
- **View**:
  - Responsible for presenting data to the user (`IoTView`).
- **Controller**:
  - Manages input and controls the flow of data between the Model and the View (`IoTController`).

This architecture ensures separation of concerns, making the system modular and maintainable.
