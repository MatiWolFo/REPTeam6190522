import MainScene from "./scenes/mainScene";
import Phaser from "phaser";

export const DEFAULT_WIDTH = 1024;
export const DEFAULT_HEIGHT = 720;

export const config = {
  type: Phaser.AUTO,
  width: DEFAULT_WIDTH,
  height: DEFAULT_HEIGHT,
  physics: {
    default: "arcade",
    arcade: {
      gravity: { y: 300 },
      debug: false,
    },
  },
  scene: [MainScene],
};
