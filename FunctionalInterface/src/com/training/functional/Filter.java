package com.training.functional;

@FunctionalInterface
public interface Filter<T> {

	public boolean test(T t);
}
