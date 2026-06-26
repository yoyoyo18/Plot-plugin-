Content:
# 🎮 PlotGenesis - Minecraft Plot Plugin

A plot generation and management plugin for PaperMC 1.21.1

---

## ✨ Features

### Plot Commands
- `/plot claim` - Claim the plot you're standing in
- `/plot auto` - Automatically claim a free plot
- `/plot home` - Teleport to your plot
- `/plot visit <player>` - Visit another player's plot
- `/plot list` - List all your plots
- `/plot info` - View plot information
- `/plot clear` - Clear your plot
- `/plot delete` - Delete your plot claim

### Admin Commands
- `/plotworld <name>` - Create a new plot world

### Features
- Automatic grid-based plot world generation
- Customizable plot sizes (default 32x32)
- Roads between plots with borders
- Plot protection system
- Teleportation system

---

## 📥 Installation

1. Download the **PlotGenesis-1.0.0.jar** from the Actions tab
2. Put it in your server's `plugins/` folder
3. Restart your server
4. Run `/plotworld myplots` to create a plot world
5. Players can use `/plot auto` to claim plots!

---

## ⚙️ Configuration

Edit `plugins/PlotGenesis/config.yml` to customize:

- Plot sizes
- Road widths
- Block materials
- Max plots per player
- Protection settings
- Messages

---

## 🔑 Permissions

- `plotgenesis.claim` - Claim plots (default: true)
- `plotgenesis.auto` - Auto-claim (default: true)
- `plotgenesis.home` - Teleport home (default: true)
- `plotgenesis.admin` - Admin commands (default: op)
- `plotgenesis.bypass` - Bypass protection (default: op)

---

## 📋 Requirements

- PaperMC 1.21.1 or higher
- Java 21

---

**Enjoy building with PlotGenesis! 🎮✨**
