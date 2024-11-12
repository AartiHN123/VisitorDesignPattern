# Vehicle Inspection System

## Commit Information
### Activity 1
- Commit Hash: 58dd77b3940eea0ca8181cbcd22a654548a14b47

## File Structure
- Original files remain unchanged
- New files added:
  - AltVehicleInspection.java
  - VehicleFactory.java
  - AltVehicleService.java
  - AltMain.java

## Running the Program
The program can be run with the following system properties:
- `data`: Path to the JSON file containing vehicle data
- `vi`: Type of vehicle inspector to use
  - `alt`: Uses AltVehicleInspection
  - anything else (or null): Uses VehicleInspection

## Compilation Instructions
1. Compile all files:
```bash
javac -d classes -cp .:lib/json-simple-1.1.1.jar src/*.java
```

2. Run Activity 1 implementation:
```bash
java -cp classes:lib/json-simple-1.1.1.jar -Dvi=alt -Ddata=data.json AltMain
```

Note: For Windows, use semicolon (;) instead of colon (:) in classpath.