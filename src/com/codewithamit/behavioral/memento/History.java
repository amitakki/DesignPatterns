package com.codewithamit.behavioral.memento;

import java.util.Stack;

public class History {

    private Stack<EditorState> states = new Stack<>();

    public void pushState(EditorState state) {
        states.push(state);
    }

    public EditorState popState() {
        if (!states.isEmpty()) {
            return states.pop();
        }
        return new EditorState("");
    }
}
