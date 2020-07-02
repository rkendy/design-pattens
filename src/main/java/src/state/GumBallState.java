package src.state;

import src.state.states.*;

public enum GumBallState {

    SOLD_OUT() {
        public State getImpl() {
            return new SoldOutState();
        }
    },
    NO_QUARTER() {
        public State getImpl() {
            return new NoQuarterState();
        }
    },
    HAS_QUARTER() {
        public State getImpl() {
            return new HasQuarterState();
        }
    };

    public State getImpl() {
        return null;
    }

}