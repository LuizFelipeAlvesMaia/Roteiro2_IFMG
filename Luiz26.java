/**
 *Faça um algoritmo que receba o salário base e o tempo de serviço de um funcionário. Calcule e mostre:
    (i) O imposto, conforme tabela:

    (ii) A gratificação, conforme tabela:

    (iii) O salário líquido, ou seja, salário base menos imposto mais gratificação
    (iv) A categoria que está na tabela a seguir:
* 
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;
import java.util.Scanner;


public class Luiz26 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int salarioBase;
        int tempoDeServico;
        double salarioComImposto, salarioLiquido;
        
        System.out.println("Digite o sálario base do funcionario ");
        salarioBase = teclado.nextInt();
        
        System.out.println("Digite o tempo de serviço do funcionario:");
        tempoDeServico= teclado.nextInt();
        
 if(salarioBase <200.00){
    System.out.println("Você está isento de impostos:");
    
            if(salarioBase<500){
                
                    if(tempoDeServico < 3){
                    
                    salarioLiquido = salarioBase + 23; //23 é a gratificação do funcionario
                             
                            if (salarioLiquido <350){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria A");

                            }else if(salarioLiquido >=350 && salarioLiquido <600){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria B");

                            }else if(salarioLiquido >=600){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria C");
                            }
                    }else if( tempoDeServico >= 3 && tempoDeServico < 6){
                        
                    salarioLiquido = salarioBase + 35; //35 é a gratificação do funcionario
                    
                             if (salarioLiquido <350){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria A");
                                        
                             }else if(salarioLiquido >=350 && salarioLiquido <600){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria B");

                             }else if(salarioLiquido >=600){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria C");
                             }
                             
                    }else if(tempoDeServico >=6){
                        
                    salarioLiquido = salarioBase + 33; //033 é a gratificação do funcionario
                    
                             if (salarioLiquido <350){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria A");
                                        
                             }else if(salarioLiquido >=350 && salarioLiquido <600){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria B");

                             }else if(salarioLiquido >=600){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria C");
                             }
                        }         
            }
            
}else if(salarioBase >=200 && salarioBase <=450){
  salarioComImposto = salarioBase * 0.97;
    double imposto = salarioBase * 0.3;
               System.out.println("O imposto a ser pago do funcionario: "+imposto);

            if( salarioBase <=500){
                    if(tempoDeServico < 3){
                            
                    salarioLiquido = salarioComImposto + 23; //23 é a gratificação do funcionario
                             
                             if (salarioLiquido <350){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria A");
                                        
                             }else if(salarioLiquido >=350 && salarioLiquido <600){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria B");

                             }else if(salarioLiquido >=600){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria C");
                             }
                             
                    }else if( tempoDeServico >= 3 && tempoDeServico < 6){
                        
                    salarioLiquido = salarioComImposto + 35; //35 é a gratificação do funcionario
                    
                             if (salarioLiquido <350){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria A");
                                        
                             }else if(salarioLiquido >=350 && salarioLiquido <600){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria B");

                             }else if(salarioLiquido >=600){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria C");
                             }
                             
                    }else if(tempoDeServico >=6){
                        
                    salarioLiquido = salarioComImposto + 33; //033 é a gratificação do funcionario
                    
                             if (salarioLiquido <350){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria A");
                                        
                             }else if(salarioLiquido >=350 && salarioLiquido <600){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria B");

                             }else if(salarioLiquido >=600){
                                        System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria C");
                             }
                        }
                    }
            
}else if(salarioBase >450 && salarioBase <700){
   salarioComImposto = salarioBase *0.92;
      double imposto = salarioBase * 0.8;
               System.out.println("O imposto a ser pago do funcionario: "+imposto);

            if(salarioBase > 500 ){
                        
                        if(tempoDeServico <= 3){
                            
                        salarioLiquido = salarioComImposto + 20; //20 é a gratificação do funcionario
                        
                                    if (salarioLiquido <350){
                                            System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria A");
                                        
                                    }else if(salarioLiquido >=350 && salarioLiquido <600){
                                            System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria B");

                                    }else if(salarioLiquido >=600){
                                            System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria C");
                                    }
                            
                       }else if(tempoDeServico > 3){
                                
                        salarioLiquido = salarioComImposto + 300; //30 é a gratificação do funcionario
                             
                                    if (salarioLiquido <350){
                                            System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria A");
                                        
                                    }else if(salarioLiquido >=350 && salarioLiquido <600){
                                             System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria B");

                                    }else if(salarioLiquido >=600){
                                            System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ "De categoria C");
                                    }
                              
                             }
            }else if( salarioBase <=500){
                        
                        if(tempoDeServico < 3){
                            
                        salarioLiquido = salarioComImposto + 23; //23 é a gratificação do funcionario
                                    if (salarioLiquido <350){
                                            System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria A");
                                        
                                    }else if(salarioLiquido >=350 && salarioLiquido <600){
                                            System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria B");

                                    }else if(salarioLiquido >=600){
                                            System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria C");
                                    } 
                        }else if( tempoDeServico >= 3 && tempoDeServico < 6){
                            
                        salarioLiquido = salarioComImposto + 35; //35 é a gratificação do funcionario
                                     if (salarioLiquido <350){
                                             System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria A");
                                        
                                    }else if(salarioLiquido >=350 && salarioLiquido <600){
                                             System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria B");

                                    }else if(salarioLiquido >=600){
                                            System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria C");
                                     }
                        }else if(tempoDeServico >=6){
                            
                        salarioLiquido = salarioComImposto + 33; //033 é a gratificação do funcionario
                                     if (salarioLiquido <350){
                                            System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria A");
                                        
                                     }else if(salarioLiquido >=350 && salarioLiquido <600){
                                            System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria B");

                                    }else if(salarioLiquido >=600){
                                            System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria C");
                                    }
                        }
                    }
}else if(salarioBase >=700){
   salarioComImposto = salarioBase * 0.88;
        double imposto = salarioBase * 0.12;
                System.out.println("O imposto a ser pago do funcionario: "+imposto);

            if(salarioBase > 500 ){
                         
                        if(tempoDeServico <= 3){
                            
                            salarioLiquido = salarioComImposto + 20; //20 é a gratificação do funcionario
                            
                                    if (salarioLiquido <350){
                                             System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria A");
                                        
                                    }else if(salarioLiquido >=350 && salarioLiquido <600){
                                            System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria B");

                                     }else if(salarioLiquido >=600){
                                             System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria C");
                                    }
                        }else if(tempoDeServico > 3){
                            
                             salarioLiquido = salarioComImposto + 300; //30 é a gratificação do funcionario
                             
                                    if (salarioLiquido <350){
                                             System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria A");
                                        
                                    }else if(salarioLiquido >=350 && salarioLiquido <600){
                                            System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria B");

                                      }else if(salarioLiquido >=600){
                                             System.out.println("O salario do funcionario é de: "+ "R$"+salarioLiquido+ " De categoria C");
                             }
                    
                        }
        }
            
        
        
    }
        
    }
    
}

    
