package blbl.cat3399.core.ui

interface TabSwitchFocusTarget {
    // Entering content from a focused tab item: focus first card.
    fun requestFocusFirstCardFromTab(): Boolean

    // Switching tabs from content edge: restore last focused card when possible, fallback to first card.
    fun requestFocusFirstCardFromContentSwitch(): Boolean

    // Returning to tab0 content via Back key (scheme B): always focus the first card deterministically.
    // Default implementation keeps backward compatibility for existing targets.
    fun requestFocusFirstCardFromBackToTab0(): Boolean = requestFocusFirstCardFromContentSwitch()
}
