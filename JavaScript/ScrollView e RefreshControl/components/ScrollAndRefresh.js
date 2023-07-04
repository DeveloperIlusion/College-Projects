import React, {useState} from 'react';
import {View, Text, ScrollView, RefreshControl} from 'react-native';
import Estilos from '../styles/styles';

export default function ScrollRefresh(){

  const [updating, setUpdating] = useState(false);

  function onUpdate(){
    setUpdating(true);
    setTimeout(() => {
        setUpdating(false); 
      }, 3000);
  }

  return(
    <View>
        <ScrollView
            style = {Estilos.scrollAndRefresh}
            refreshControl = {
              <RefreshControl
                  refreshing = {updating}
                  onRefresh = {onUpdate}
              />
            }
        >
        <Text style={Estilos.texto}>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed commodo vulputate malesuada. Nullam efficitur vehicula pellentesque. Duis aliquam sapien eget ex sagittis sagittis. Sed porttitor magna libero, sit amet tristique ex bibendum in. Phasellus nec convallis lacus, at aliquam tortor. Quisque lobortis convallis massa, ut tristique est pellentesque quis. Duis id posuere mauris.

Mauris malesuada, leo vel semper aliquet, neque elit bibendum urna, sed mattis leo diam sed velit. Sed viverra lacus tortor, ut interdum diam egestas ac. Proin id consequat enim. Aliquam vitae nisl sed urna facilisis aliquam eu sit amet odio. Phasellus diam libero, pretium non ante non, ultrices accumsan elit. Sed ut neque risus. Phasellus quis nulla nibh. Pellentesque nisi urna, rutrum pharetra velit id, aliquet fringilla diam. Integer arcu elit, tempus vitae ante a, tristique vulputate ipsum. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.

Donec nibh nibh, laoreet porta metus sed, ullamcorper pellentesque tellus. Donec finibus viverra ligula et tristique. Duis pellentesque ultricies finibus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Donec sit amet placerat quam, et pulvinar sem. Fusce sapien metus, egestas eget mauris quis, tristique maximus elit. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.

Maecenas elementum feugiat lacus, et ultrices est sodales a. Vivamus eget dui ut massa tincidunt sagittis vitae in felis. Maecenas ut congue mi. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Donec dictum est nec ultricies feugiat. Phasellus a lectus eget nisi malesuada interdum. Cras fringilla consequat purus. Maecenas nec ante ligula. Ut vitae nunc ac nisl lacinia consectetur.

Vivamus consectetur, ex a tempus vehicula, justo lacus bibendum quam, vitae finibus leo erat at felis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Praesent egestas, nibh consequat mollis mattis, tellus ipsum pharetra augue, sit amet fringilla metus orci ac metus. Proin dolor neque, vestibulum ut euismod eget, bibendum eu mauris. Nulla tristique ullamcorper ipsum, in dictum justo ornare nec. Vivamus luctus varius enim, at dictum metus. Aenean quis neque leo. Sed sapien lectus, sodales in interdum quis, blandit sit amet nibh. Nulla interdum consectetur erat non accumsan. Aliquam eu mollis nibh.

Nunc eu ante blandit, rhoncus augue vestibulum, dapibus neque. Mauris volutpat ligula turpis, non varius sapien interdum eget. Proin elementum sit amet lectus nec dignissim. Nam rhoncus, massa non tincidunt mollis, ex mi sagittis mauris, a fermentum leo mi at urna. Mauris non eros scelerisque, semper turpis vel, iaculis magna. Vivamus sed mattis mauris. Cras non arcu lectus. Aenean ut rhoncus massa. Donec feugiat, arcu posuere venenatis consectetur, velit enim placerat dolor, in sollicitudin enim elit eget ante. Nam rutrum enim et diam iaculis congue eu vitae mi. Suspendisse hendrerit nulla non ligula blandit ullamcorper.
        </Text>
      </ScrollView>
    </View>
  )
}