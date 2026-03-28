import type { Component, JSX } from "solid-js";

interface Props {
  label: string;
  children: JSX.Element;
}

const WidgetFrame: Component<Props> = (props) => (
  <div class="flex flex-col justify-between bg-overlay-surface border border-overlay-border rounded p-1.5 h-14 w-full">
    <span class="text-[8px] text-text-muted uppercase tracking-wider leading-none">
      {props.label}
    </span>
    <div>{props.children}</div>
  </div>
);

export default WidgetFrame;
