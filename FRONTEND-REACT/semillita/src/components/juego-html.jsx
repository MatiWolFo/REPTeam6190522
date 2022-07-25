import React, { useRef } from "react";
import { useGame } from "../hooks";
import {config} from "../game/config";

function JuegoHtmlComponent() {
    const parentEl = useRef(null);
    useGame(config, parentEl);
    return(
        <div ref={parentEl} className="gameContainer" />
    )
}

export default JuegoHtmlComponent