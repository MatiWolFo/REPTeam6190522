import React from "react";
import { Link } from 'react-router-dom'

function VideoComponent() {
    return (
        <>
            <div class="container" align="center">
                <div class="video">
                <iframe width="560" height="315" src="https://www.youtube.com/embed/SmQjMNBvwD4" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                </div>
            </div>
            <div className="botonn">
                <span>
                    <Link to="/preguntas" className="siguiente">
                        SIGUIENTE
                    </Link>
                </span>
            </div>
        </>
    )
}

export default VideoComponent;