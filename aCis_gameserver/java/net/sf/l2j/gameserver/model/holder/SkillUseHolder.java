package net.sf.l2j.gameserver.model.holder;

import org.slf4j.LoggerFactory;

import net.sf.l2j.gameserver.skills.L2Skill;

/**
 * Skill casting information (used to queue when several skills are cast in a
 * short time)
 *
 */
public class SkillUseHolder {

	private L2Skill _skill;
	private boolean _ctrlPressed;
	private boolean _shiftPressed;

	public SkillUseHolder() {
	}

	public SkillUseHolder(L2Skill skill, boolean ctrlPressed, boolean shiftPressed) {
		_skill = skill;
		_ctrlPressed = ctrlPressed;
		_shiftPressed = shiftPressed;
	}

	public L2Skill getSkill() {
		return _skill;
	}

	public int getSkillId() {
		return (getSkill() != null) ? getSkill().getId() : -1;
	}

	public boolean isCtrlPressed() {
		return _ctrlPressed;
	}

	public boolean isShiftPressed() {
		return _shiftPressed;
	}

	public void setSkill(L2Skill skill) {
		_skill = skill;
	}

	public void setCtrlPressed(boolean ctrlPressed) {
		_ctrlPressed = ctrlPressed;
	}

	public void setShiftPressed(boolean shiftPressed) {
		_shiftPressed = shiftPressed;
	}
}
