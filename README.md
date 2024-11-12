# Vehicle Inspection System

## Commit Information

### Activity 1
- **Commit Hash**: `58dd77b3940eea0ca8181cbcd22a654548a14b47`
- **New Files Added**: 
  - `AltVehicleInspection.java`
  - `VehicleFactory.java`
  - `AltVehicleService.java`
  - `AltMain.java`

### Activity 2
- **Commit Hash**: `76d43c2b7d3c8931d35f60f8cbc97e4263894b1b`
- **New Files Added**:
  - `Act2Main.java`
  - `Act2VehicleService.java`

### Activity 3
- **Commit Hash**: `0e68bdf81da9b7667dc319871d99cf17e426ca08`
- **New Files Added**:
  - `Act3Main.java`
  - `Act3VehicleService.java`
  - `IEmissionsStrategy.java`
  - `OneEmissionsStrategy.java`
  - `TwoEmissionStrategy.java`
  - `NullEmissionsStrategy.java`

## System Properties
The program uses system properties to configure the data source, the vehicle inspection type, and the emissions strategy:
- **`data`**: Path to the JSON file containing vehicle data.
- **`vi`**: Type of vehicle inspector to use:
  - `alt`: Uses `AltVehicleInspection`
  - Other (or null): Uses `VehicleInspection`
- **`es`**: Type of emissions strategy to use:
  - `one`: Uses `OneEmissionsStrategy`
  - `two`: Uses `TwoEmissionStrategy`
  - Other (or null): Uses `NullEmissionsStrategy`

## Compilation and Execution

### 1. Compile
First, compile all Java files (common for all activities):
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

#### Activity 3
For Activity 3, use the following command. The `es` property should be set to either `one`, `two`, or left out for the default (null) strategy.

```bash
java -cp classes:lib/json-simple-1.1.1.jar -Dvi=alt -Ddata=data.json -Des=one Act3Main
```

This command runs `Act3Main` using the `OneEmissionsStrategy`. To switch strategies, change the `es` property value as follows:
- **`-Des=one`** for `OneEmissionsStrategy`
- **`-Des=two`** for `TwoEmissionStrategy`
- **Omit `-Des` or set it to anything else** to use `NullEmissionsStrategy`

### Note for Windows Users
For Windows systems, use a semicolon (`;`) instead of a colon (`:`) in the classpath. 


### Activity 4 -

I learned that both the Strategy and Visitor patterns are helpful for adding behaviors, but they work better in different situations. The Strategy pattern, which I used in Activity 3 to change how emissions fees are calculated, is great for cases where you want to easily swap behaviors. For example, you can switch between different fee calculation methods without changing the main code. On the other hand, the Visitor pattern lets you add new actions without changing the original classes. I used it in Activity 1 to create different vehicle inspections using the `IVehicleInspector` interface. This pattern was useful because it let me add new types of inspections without changing the vehicle classes, making it easier to expand in the future. Overall, I found the Strategy pattern more straightforward for switching behaviors, like emissions calculations, while the Visitor pattern was more useful for performing specific actions on different types of objects, like inspecting different vehicle types.
