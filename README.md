# Vehicle Inspection System

## Commit Information

### Activity 1
- **Commit Hash**: `58dd77b3940eea0ca8181cbcd22a654548a14b47`
- **File Changes**:
  - *Original files*: No modifications
  - *New files added*: 
    - `AltVehicleInspection.java`
    - `VehicleFactory.java`
    - `AltVehicleService.java`
    - `AltMain.java`

### Activity 2
- **Commit Hash**: `76d43c2b7d3c8931d35f60f8cbc97e4263894b1b`
- **Files**:
  - `Act2Main.java`
  - `Act2VehicleService.java`

## System Properties
The program uses system properties to configure the data source and the vehicle inspection type:
- **`data`**: Path to the JSON file containing vehicle data.
- **`vi`**: Type of vehicle inspector to use:
  - `alt`: Uses `AltVehicleInspection`
  - Other (or null): Uses `VehicleInspection`

## Compilation and Execution

### 1. Compile
First, compile all Java files (common for both activities):
```bash
javac -d classes -cp .:lib/json-simple-1.1.1.jar src/*.java
```

### 2. Run the Program

Choose one of the following commands to run the desired activity:

#### Activity 1
```bash
java -cp classes:lib/json-simple-1.1.1.jar -Dvi=alt -Ddata=data.json AltMain
```

#### Activity 2
```bash
java -cp classes:lib/json-simple-1.1.1.jar -Dvi=alt -Ddata=data.json Act2Main
```

### Note for Windows Users
For Windows systems, use a semicolon (`;`) instead of a colon (`:`) in the classpath.