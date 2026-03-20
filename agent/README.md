# Wakfu Spy Agent

## Qu'est-ce que c'est ?
Un Java Agent qui s'injecte dans le client Wakfu pour intercepter
les messages reseau Netty AVANT qu'ils ne soient consommes par le client.

## Pourquoi ?
Le client Wakfu logue les messages Netty dans wakfu_spy.log mais:
- Le toString() plante sur certains messages (csC=ERROR, cvn=ERROR)
- Les prix HDV ne sont pas logues (consommes par le handler avant le log)
- Les depots au coffre n'ont que le uniqueId (pas le refId)

Notre agent intercepte les donnees COMPLETES.

## Comment compiler ?
Copy
H:\Code\Wakfuassistant\agent\build.bat


## Comment lancer ?
H:\Code\Wakfuassistant\agent\launch_wakfu_with_agent.bat


## Architecture
- WakfuSpyAgent.java      : Point d'entree (premain/agentmain)
- ClassDiscoveryTransformer: Phase 1 - decouvre les classes Wakfu
- MessageInterceptorTransformer: Phase 2 - intercepte les messages (V2)

## Logs
Les logs sont dans: H:\Code\Wakfuassistant\agent\logs\wakfu_agent_spy.log

## Phase 1 (actuelle): Decouverte
L'agent observe quelles classes sont chargees et identifie celles
liees aux messages, inventaires, HDV, etc. sans rien modifier.

## Phase 2 (a venir): Interception
Une fois les bonnes classes identifiees, on utilisera Byte Buddy
pour instrumenter les methodes de decodage des messages.
