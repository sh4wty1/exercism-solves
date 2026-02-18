class Badge {
    public String print(Integer id, String name, String department) {
        if (id == null && department != null) {
            return "%s - %s".formatted(name, department.toUpperCase());
        } else if (department == null) {
            if (id == null) {
                return "%s - OWNER".formatted(name);
            } else {
                return "[%d] - %s - OWNER".formatted(id, name);
            }
        }
        return "[%d] - %s - %s".formatted(id, name, department.toUpperCase());
    }
}
