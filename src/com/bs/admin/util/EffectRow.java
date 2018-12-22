package com.bs.admin.util;

import java.util.List;

public class EffectRow<T> {

	private List<T> inserted;
	private List<T> updated;
	private List<T> deleted;

	public List<T> getInserted() {
		return inserted;
	}

	public void setInserted(List<T> inserted) {
		this.inserted = inserted;
	}

	public List<T> getUpdated() {
		return updated;
	}

	public void setUpdated(List<T> updated) {
		this.updated = updated;
	}

	public List<T> getDeleted() {
		return deleted;
	}

	public void setDeleted(List<T> deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "EffectRow [inserted=" + inserted + ", updated=" + updated + ", deleted=" + deleted + "]";
	}

	public EffectRow(List<T> inserted, List<T> updated, List<T> deleted) {
		this.inserted = inserted;
		this.updated = updated;
		this.deleted = deleted;
	}

	public EffectRow() {
	}

}
