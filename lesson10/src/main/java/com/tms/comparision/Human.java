package com.tms.comparision;

public final class Human implements Comparable<Human> {

	private String name;
	private int height;

	public Human(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Human{" +
                "height=" + height + '\'' +
                ", name='" + name +
				'}';
	}

    @Override
    public int compareTo(Human hum) {
        return this.getHeight() - hum.getHeight();
    }
}
