public class Laptop {
    String dram;
    String cpu;
    String color;
    String memory;
    String operationSystem;

    @Override
    public String toString() {
        return "Процессор: " + cpu + ", Операционная система: " + operationSystem + ", Объём ОЗУ: " + dram
                + ", Объём памяти: " + memory + ", Цвет: " + color;
    }

    public String getDram() {
        return dram;
    }

    public String getMemory() {
        return memory;
    }

    public String getColor() {
        return color;
    }

    public String getCpu() {
        return cpu;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setDram(String dram) {
        this.dram = dram;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public boolean equals(Object obj) {
        Laptop lep = (Laptop) obj;
        if ((cpu.equals(lep.cpu) || lep.cpu == null) && (color.equals(lep.color) || lep.color == null) &&
                (operationSystem.equals(lep.operationSystem) || lep.operationSystem == null) &&
                (memory.equals(lep.memory) || lep.memory == null) &&
                (dram.equals(lep.dram) || lep.dram == null)) {
            return true;
        } else {
            return false;
        }
    }
}

